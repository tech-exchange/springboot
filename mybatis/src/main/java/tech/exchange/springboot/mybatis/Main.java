package tech.exchange.springboot.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tech.exchange.springboot.mybatis.dao.MyTableMapper;
import tech.exchange.springboot.mybatis.model.MyRow;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yurun
 */
@SpringBootApplication
public class Main implements CommandLineRunner {

  @Autowired
  private MyTableMapper mapper;

  public void insertMyRows() {
    MyRow row1 = new MyRow();

    row1.setCol1("a1");
    row1.setCol2("b1");

    MyRow row2 = new MyRow();

    row2.setCol1("a2");
    row2.setCol2("b2");

    List<MyRow> rows = new ArrayList<>();

    rows.add(row1);
    rows.add(row2);

    int value = mapper.insertMyRows(rows);
    System.out.println(value);

    rows.forEach(row -> {
      System.out.println(row.getId());
    });
  }

  public void selectMyRow() {
    int id = 1;
    MyRow row = mapper.selectMyRow(id);

    System.out.println(row.getId());
    System.out.println(row.getCol1());
    System.out.println(row.getCol2());
  }

  public void selectMyRows() {
    List<MyRow> rows = mapper.selectMyRows();

    rows.forEach(System.out::println);
  }

  public void updateMyRow() {
    MyRow row = new MyRow();

    row.setId(1);
    row.setCol1("c");
    row.setCol2("d");

    int value = mapper.updateMyRow(row);
    System.out.println(value);
  }

  public void deleteMyRow() {
    int id = 1;

    int value = mapper.deleteMyRow(id);
    System.out.println(value);
  }

  @Override
  public void run(String... args) throws Exception {
    deleteMyRow();
  }

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
