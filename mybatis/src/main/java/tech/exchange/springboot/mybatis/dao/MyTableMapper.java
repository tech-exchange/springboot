package tech.exchange.springboot.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import tech.exchange.springboot.mybatis.model.MyRow;

import java.util.List;

/**
 * @author yurun
 */
@Mapper
public interface MyTableMapper {
  /**
   * 插入一行记录。
   *
   * @param row 一行记录
   * @return 影响行数
   */
  int insertMyRow(MyRow row);

  /**
   * 插入多行记录。
   *
   * @param rows 多行记录
   * @return 影响行数
   */
  int insertMyRows(List<MyRow> rows);

  /**
   * 查询一行记录
   *
   * @param id 记录ID
   * @return 记录
   */
  MyRow selectMyRow(int id);

  /**
   * 查询多行记录
   *
   * @return 多行记录
   */
  List<MyRow> selectMyRows();

  /**
   * 修改记录
   *
   * @param row 一行记录
   * @return 影响行数
   */
  int updateMyRow(MyRow row);

  /**
   * 删除记录
   *
   * @param id 记录ID
   * @return 影响行数
   */
  int deleteMyRow(int id);
}
