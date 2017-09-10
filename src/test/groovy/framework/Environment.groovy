package framework

/**
 * Created by aleksejs.trescalins on 10/09/17.
 */

class Environment {
    static Properties getProperties() throws IOException {
        Properties prop = new Properties()
        InputStream input = new FileInputStream("properties/default.properties")
        prop.load(input)
        input.close()
        return prop
    }
}
