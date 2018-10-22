package cn.tcht.stock.dal;

import java.util.List;
import java.util.Map;

import com.github.pagehelper.Page;

/**
 * @author wangwei@teamsun.com
 * @version V1.0.0
 * @Title: ISuperDAO
 * @Package com.jccfc.fundout.channel.dal
 * @Description:
 * <p>
 *     all sql statement packaged base interface.
 * </p>
 * @date 2018/1/8 13:07
 */
public interface ISuperDAO {


    /*	*//**
     * Get the sqlmap used for this DAO
     *
     * @return SqlMapClient
     *//*

	public SqlMapClient getSqlMap();*/

    /**
     * Update or Insert into tables
     *
     * @param statementName   the input parameter
     * @param parameterObject the input parameter
     * @return the return update counts
     *         <p/>
     *         if business logic throws Exception
     */
    public Integer update(String statementName, Object parameterObject);


    /**
     * delete from the tables
     *
     * @param statementName   the input parameter
     * @param parameterObject the input parameter
     * @return the return value
     *         if business logic throws Exception
     */
    public Integer delete(String statementName, Object parameterObject);


    /**
     * Insert into tables
     *
     * @param statementName   the input parameter
     * @param parameterObject the input parameter
     * @return to return the object key
     *         if business logic throws Exception
     */
    public int insert(String statementName, Object parameterObject);


    /**
     * Gets the list of objects
     *
     * @param statementName   the sqlmap stateent name
     * @param parameterObject the input parameters object
     * @return The list of objects
     *         if business logic throws Exception
     */
    public <T> List<T> getList(String statementName, Object parameterObject);



    /**
     * Gets the result as a map
     *
     * @param statementName   the sqlmap stateent name
     * @param parameterObject the input parameters object
     * @param key             the key
     * @return The results as map
     *         if business logic throws Exception
     */
    public <T, V> Map<T, V> getMap(String statementName, Object parameterObject, String key);


    /**
     * Gets as an object
     *
     * @param statementName   the sqlmap stateent name
     * @param parameterObject the input parameters object
     * @return The object
     *         if business logic throws Exception
     */
    public <T> T getObject(String statementName, Object parameterObject);

    /**
     * get pagination list
     *
     * @param statementName
     * @param param
     * @return
     */
    public Page queryPagination(String statementName, Map<String,Object> param);
}
