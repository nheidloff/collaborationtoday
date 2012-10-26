package org.openntf.news.http.core;

/*
 * � Copyright IBM, 2012
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
 * implied. See the License for the specific language governing 
 * permissions and limitations under the License.
 * 
 * Author: Niklas Heidloff - niklas_heidloff@de.ibm.com
 */

import java.util.Comparator;
import java.util.Map;

class PersonComparator implements Comparator {
	Map _map;
	public PersonComparator(Map map) {
		_map = map;
	}
	public int compare(Object firstKey, Object secondKey) {				
		Person firstPerson = (Person)_map.get(firstKey);
		Person secondPerson = (Person)_map.get(secondKey);
		return firstPerson.getDisplayName().toLowerCase().compareTo(secondPerson.getDisplayName().toLowerCase());
	}
}
