/*
 * list.stream().sorted(Collections.reversOrder()).skip(2).limit(1).forEach(
 * System.out::println);
 * 
 * // highest int val = list.stream().max(Integer::compare).get();
 * System.out.println("highest value : " + val); val = list.stream().max((i1,
 * i2) -> i1.compareTo(i2)).get(); System.out.println("highest value : " + val);
 * 
 * // lowest val = list.stream().min((i1, i2) -> i1.compareTo(i2)).get();
 * System.out.println("lowest value : " + val); }
 * 
 * }
 */