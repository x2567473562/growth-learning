package cn.xiao.spring.util;

import cn.xiao.spring.pojo.PropertyValue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MutablePropertyValues  implements Iterable<PropertyValue>{

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<PropertyValue>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        this.propertyValueList = (propertyValueList != null ? propertyValueList : new ArrayList<PropertyValue>());
    }

    public PropertyValue[] getPropertyValues(){
        return propertyValueList.toArray(new PropertyValue[propertyValueList.size()]);
    }

    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue propertyValue : this.propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return this.propertyValueList.isEmpty();
    }

    @Override
    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }
    public MutablePropertyValues addPropertyValue(PropertyValue pv) {
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue propertyValue = this.propertyValueList.get(i);
            //替换已存在的值
            if(propertyValue.getName().equals(pv.getName())){
                this.propertyValueList.set(i, new PropertyValue(pv.getName(),pv.getRef(), pv.getValue()));
                return this;
            }
        }
        //添加新值
        this.propertyValueList.add(pv);
        return this;
    }
    public boolean contains(String propertyName) {
        return getPropertyValue(propertyName) != null;
    }

}
