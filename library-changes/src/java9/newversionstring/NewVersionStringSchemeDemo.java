package java9.newversionstring;

/**
 * Java version-string is a format that contains version specific information. 
 * This version-string consists of major, minor, security and patch update releases.
 * In Java 9, a new version-string scheme is introduced that looks like the below.
 * <b>$MAJOR.$MINOR.$SECURITY.$PATCH</b>
 * </br></br>
 * <b>Note</b>: Each time the $PATCH version number is reset to zero if any 
 * $SECURITY, $MINOR, or $MAJOR version numbers are incremented.
 * The $MINOR and $SECURITY version numbers are set to zero, 
 * if the $MAJOR version number is incremented. However, 
 * when the $MINOR version number is incremented, 
 * the subsequent $SECURITY version number need not be set to zero.
 * </br></br>
 * In Java 9, a Runtime.Version class is added to get Java version information.
 *   
 * @author saukedia1
 *
 */
public class NewVersionStringSchemeDemo {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println("Current version is " + version); // Getting current Java version
        System.out.println("Major version number " + version.major()); // Getting major version number
        System.out.println("Minor version number " + version.minor()); // Getting minor version number
        System.out.println("Security version number " + version.security()); // Getting security version number
        System.out.println("Pre-released information " + version.pre()); // Getting pre-release version information
        System.out.println("Build Number " + version.build());
    }

}
