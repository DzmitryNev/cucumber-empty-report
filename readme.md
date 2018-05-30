Step to reproduce issue:

1) open to pom.xml and set variable "rerunFailingTestsCount" = 2 (any >0)
2) mvn clean verify
3) go to target\com\example\report\ 
    the first report (1.json for  test1.feature) is empty
    
    1.json - test1.feature - size 0    
    2.json - test2.feature - size >0
    
The next:

1) open to pom.xml and set variable "rerunFailingTestsCount" = 0
2) mvn clean verify
3) go to target\com\example\report\
    
    1.json - test1.feature - size >0    
    2.json - test2.feature - size >0

Please see screenshots into "screens" folder