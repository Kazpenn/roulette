package edu.cnm.deepdive.roulette.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity
public class Spin {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "spin_id")
  private long id;

  @NonNull
  @ColumnInfo(index = true)
  private Date timestamp = new Date();

  @ColumnInfo(index = true)
  private Integer value;

  public long getId() {
    return id;
  }

  @NonNull
  public Date getTimestamp() {
    return timestamp;
  }

  public Integer getValue() {
    return value;
  }
}
