package net.l8thStreet.sharc.exceptions;

/**
 * Created by IntelliJ IDEA.
 * User: gsandell
 * Date: Aug 8, 2006
 * Time: 10:29:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class SharcDocRequestException extends SharcException {
  public SharcDocRequestException(String codeDesc, String userDesc) {
    super(codeDesc, userDesc);
  }
}
