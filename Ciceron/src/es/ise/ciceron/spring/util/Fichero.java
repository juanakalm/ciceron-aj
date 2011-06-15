package es.ise.ciceron.spring.util;

import java.io.File;
import java.net.URI;

public class Fichero extends File
{
	private static final long serialVersionUID = 1L;
	
	public Fichero(File parent, String child)
	{
		super(parent, child);
	}

	public Fichero(String parent, String child)
	{
		super(parent, child);
	}

	public Fichero(String pathname)
	{
		super(pathname);
	}

	public Fichero(URI uri)
	{
		super(uri);
	}

	public String getExtension()
	{
		String[] parts = this.getName().split("\\.");
		return parts[parts.length-1];
	}
	
	public String getNameWithoutExtension()
	{
		return this.getName().replaceAll("\\."+getExtension(), "");
	}
}
