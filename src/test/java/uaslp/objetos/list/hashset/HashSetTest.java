package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotValidIndexException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.linkedlist.LinkedList;

public class HashSetTest {

    @Test
    public void givenASetWithOneElement_WhenDelete_ThenSizeIsZero() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hola");
        //When
        hashSet.remove("Hola");
        //Then
        int size = hashSet.size();
        Assertions.assertEquals(0, size);
        Assertions.assertFalse(hashSet.contains("Hola"));
    }

    @Test
    public void SetWithElement_whenGetIterator_thenIterate() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Hola");
        //When
        Iterator<String> iterator = hashSet.iterator();
        //Then
        int size = hashSet.size();
        HashSet<String> iterations = new HashSet<>();
        Assertions.assertEquals(1, size);
        iterations.add(iterator.next());
        Assertions.assertTrue(hashSet.contains("Hola"));

        Assertions.assertThrows(NotSuchElementException.class, iterator::next);
    }

    @Test
    public void givenANewHashSet_AddElements_AndReorganize() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        HashSet<String> hashSet = new HashSet<>();
        int i=0;
        while(i<500){
            hashSet.add("hola" + i);
            i++;
        }
        //when
        Iterator<String> iterator = hashSet.iterator();
        //Then
        HashSet<String> iterations = new HashSet<>();

        while(iterator.hasNext()){
            iterations.add(iterator.next());
        }
    }
}



