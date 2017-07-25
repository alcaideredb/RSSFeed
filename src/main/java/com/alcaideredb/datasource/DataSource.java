package com.alcaideredb.datasource;

public interface DataSource<T> {
	public T getDataSource() throws DataAccessException;
}
