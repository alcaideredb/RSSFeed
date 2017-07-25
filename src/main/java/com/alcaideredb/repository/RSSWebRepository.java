package com.alcaideredb.repository;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.alcaideredb.datasource.DataAccessException;
import com.alcaideredb.datasource.DataSource;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class RSSWebRepository implements RSSRepository<URL>{	
	
	@Override
	public String load(DataSource<URL> source, String... options) throws DataAccessException, DataParseException {
		SyndFeedInput input = new SyndFeedInput();
		try {
			SyndFeed feed = input.build(new XmlReader(source.getDataSource()));
			return feed.toString();
		} catch (IllegalArgumentException  | FeedException e) {
				throw new DataParseException(e);
		} catch (IOException e) {
			throw new DataAccessException(e);
		}		
	}

}
