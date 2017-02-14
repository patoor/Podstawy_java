
package pl.lodz.uni.math.daofactory;

import java.util.List;
import org.easymock.EasyMock;
import pl.lodz.uni.math.user.User;


public class XmlSource implements Source {
    
    private User userMock;
    List<User> listUserMock = EasyMock.mock(List.class);
    private static XmlSource xmlInstance = null;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(XmlSource.class.getName());
    
    public static XmlSource getInstance() {
		if(xmlInstance==null){
                    xmlInstance = new XmlSource();
                }
                return xmlInstance;
	}
    
    public List<User> selectAllUsers() {
        
        EasyMock.expect(listUserMock.size()).andReturn(1).anyTimes();
        EasyMock.expect(listUserMock.get(1)).andReturn(userMock).anyTimes();
        EasyMock.replay(listUserMock);
        
        return listUserMock;

    }

    public User selectUserByID(Integer id) {
    	userMock = EasyMock.createMock(User.class);
        EasyMock.expect(userMock.getID()).andReturn(id).anyTimes();
        EasyMock.expect(userMock.getName()).andReturn("Xml").anyTimes();
        EasyMock.replay(userMock);
        logger.info(userMock.getName());
        return userMock;
    }
    
}
