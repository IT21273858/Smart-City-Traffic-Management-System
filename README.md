# Smart-City-Traffic-Management-System
Project for the module ' Software Architecture (SE3030) ', done by IT21273858, IT21334542, IT21176210

1.	Run all the producer bundles before the consumer bundles, as they need to be launched separately.
2.	Creating a new OSGi configuration for each producer bundle when running.
3.	After starting each producer, by using the command “lb” we are listing all bundles and ensuring the producer bundle is marked as “ACTIVE”.
4.	If the bundle isn't found, by pressing the “Ctrl + f” key to search by bundle name or pressed “ss” to view the list of bundle IDs.
5.	Create a new OSGi configuration for the consumer bundle, and when running it, select ALL the producer bundles along with the consumer bundle. If all bundles are “Active” application would run smoothly.
