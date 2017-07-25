package com.alcaideredb.repository;

import com.alcaideredb.datasource.DataAccessException;
import com.alcaideredb.datasource.DataSource;

public interface RSSRepository<T> {
	public String load(DataSource<T> source, String... options) throws DataAccessException, DataParseException;
}
