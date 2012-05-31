package es.ise.ciceron.spring.command;

import org.springframework.web.multipart.MultipartFile;

import es.ise.ciceron.model.VersionesPliegos;

public class VersionesPliegosCommand extends VersionesPliegos
{
	private MultipartFile file;

	public MultipartFile getFile()
	{
		return file;
	}

	public void setFile(MultipartFile file)
	{
		this.file = file;
	}
	
	
}
