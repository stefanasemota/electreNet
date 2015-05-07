package ch.albertlegrand.business.utility;

import ch.albertlegrand.data.model.ScrapBook;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 20.01.12
 * Time: 20:31
 * To change this template use File | Settings | File Templates.
 */
public class SpringJdbcTemplateExtractor {
    private JdbcTemplate jdbcTemplate;
    private DriverManagerDataSource dataSource;

    public static final int NUMBERS_PER_PAGE = 10;
    private int totalPages;
    private int page;
    private List resultList;

    public void setDataSource(DriverManagerDataSource dataSource) {
        //this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<ScrapBook> getPaginationList(String sql, int currentPage, int numPerPage) {
        String countSQL = getSQLCount(sql);
        setPage(currentPage);
        setTotalPages(numPerPage, jdbcTemplate.queryForInt(countSQL));
        int startIndex = (currentPage - 1) * numPerPage;
        StringBuffer paginationSQL = new StringBuffer(" ");
        paginationSQL.append(sql);
        paginationSQL.append(" limit " + startIndex + "," + numPerPage);
        return jdbcTemplate.query(paginationSQL.toString(), new ScrapBookRowMapper());
    }

    public String getSQLCount(String sql) {
        String sqlBak = sql.toLowerCase();
        String searchValue = " from ";
        String sqlCount = "select count(*) from " + sql.substring(sqlBak.indexOf(searchValue) + searchValue.length(), sqlBak.length());
        return sqlCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List getResultList() {
        return resultList;
    }


    // set total number of pages
    public void setTotalPages(int numPerPage, int totalRows) {
        if (totalRows % numPerPage == 0) {
            this.totalPages = totalRows / numPerPage;
        } else {
            this.totalPages = (totalRows / numPerPage) + 1;
        }
    }

    public int findTotalScrapBook() {
        String sql = "SELECT COUNT(*) FROM ScrapBook";
        int total = jdbcTemplate.queryForInt(sql);
        return total;
    }

    public void deleteCollection(Collection<ScrapBook> collection) {
        int rowsDeleted = 0;
        for (ScrapBook scrapBook : collection) {
            Object[] params = {scrapBook.getScrapbookid()};
            rowsDeleted = jdbcTemplate.update("DELETE  from ScrapBook where scrapbookid=?", params);
        }
    }
}
