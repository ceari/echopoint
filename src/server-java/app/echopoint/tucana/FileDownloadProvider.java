/*
 * This file is part of the Echo Point Project.  This project is a
 * collection of Components that have extended the Echo Web Application
 * Framework Version 3.
 *
 * Version: MPL 1.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 */

package echopoint.tucana;

import static eu.medsea.util.MimeUtil.getMimeType;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.IOUtils;

/**
 * A download provider for sending files to the client.
 *
 * @author Rakesh 2008-11-10
 * @version $Id$
 */
public class FileDownloadProvider extends AbstractDownloadProvider
{
  private static final long serialVersionUID = 1l;

  /** The file that is to be enqueued for download to the client. */
  private final File file;

  public FileDownloadProvider( final File file )
  {
    this.file = file;
    this.fileName = file.getName();
    this.size = file.length();
  }

  /**
   * Returns the content type, for example "text/plain".
   *
   * @return the content type.
   */
  public String getContentType()
  {
    return ( contentType != null ) ? contentType : getMimeType( file );
  }

  /**
   * Writes the file data to the output stream.
   *
   * @param out the output stream to which the file data must be written.
   * @throws IOException If errors are encountered while writing the contents
   *   to the output stream.
   */
  @SuppressWarnings( { "IOResourceOpenedButNotSafelyClosed" } )
  public void writeFile( final OutputStream out ) throws IOException
  {
    status = Status.inprogress;

    try
    {
      final BufferedInputStream bis =
          new BufferedInputStream( new FileInputStream( file ) );
      IOUtils.copy( bis, out );
      out.flush();
      bis.close();
    }
    catch ( IOException e )
    {
      status = Status.failed;
      throw e;
    }

    status = Status.completed;
  }
}
