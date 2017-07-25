package com.alcaideredb.datasource;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDataSource implements  DataSource<URL>{

	private URL sourceURL;
	private String sourceURLPath;
	
	public URLDataSource(String url) {
		this.sourceURLPath = url;
	}
	
	@Override
	public URL getDataSource() throws DataAccessException {
		sourceURL = null;
		try {
			sourceURL = new URL(sourceURLPath);
		} catch (MalformedURLException e) {
			throw new DataAccessException(e);
		}
		return sourceURL;
	}

}
