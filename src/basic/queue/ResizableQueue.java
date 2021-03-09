package basic.queue;

import java.util.logging.Logger;

public class ResizableQueue <Item> {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private int capacity;
    private Item[] data;

}
