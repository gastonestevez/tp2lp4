package untref.shakedecide;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Leandro Baldi on 25/03/2016.
 */
public class ShakeableList {

    private Boolean valuesReposition;

    private Random randomGenerator;

    // List with all possibles values
    private List <String> values = new ArrayList <String> ();

    //Every time we shake a event occurs
    private List <String> events = new ArrayList<String>();


    public ShakeableList(Boolean valuesReposition) {

        this.valuesReposition = valuesReposition;

        this.randomGenerator = new Random();

    }

    /** Obtains a item from values and add and event.
     ** Depending on reposition configuration, item is removed or not from values.
     **/
    public void shake() throws Exception {

        if ( this.values.isEmpty() )

            throw new Exception("Value list is empty. First add some items to values.");

        int valueIndex = this.randomGenerator.nextInt(this.values.size());

        String value;

        if ( this.valuesReposition )

            value = this.values.get(valueIndex);

        else

            value = this.values.remove(valueIndex);

        this.events.add(value);

    }



    public List <String> getValues() {
        return values;
    }



    public void setValues(List <String> values) {
        this.values = values;
    }



    public List<String> getEvents() {
        return events;
    }
}
