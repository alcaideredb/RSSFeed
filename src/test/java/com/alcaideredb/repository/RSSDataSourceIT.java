package com.alcaideredb.repository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

import com.alcaideredb.datasource.DataSource;
import com.alcaideredb.datasource.URLDataSource;
import com.alcaideredb.repository.RSSRepository;
import com.alcaideredb.repository.RSSWebRepository;

public class RSSDataSourceIT {
 
	@Test
	public void RETRIEVE_STRING_CONTENT_FROM_WEB_DATA_SOURCE() {
		DataSource dataSource = new URLDataSource("http://tech.uzabase.com/rss");
		RSSRepository rssRepository = new RSSWebRepository();
		String rss = rssRepository.load(dataSource);
		assertTrue(!rss.isEmpty());
	}

}
