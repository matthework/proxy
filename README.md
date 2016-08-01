# proxy

******************* todo list *******************  

set up working proxy  
filter sensitive keywords  
replace with meaningless symbols  
make "text-to-speech" working  
 


******************* run locally *******************  

// go to java folder  
cd workspace/java  

// compile *.java  
$ javac src/proxy/*.java -d bin  

// go to java/bin folder  
cd workspace/java/bin  

// run app  
$ java proxy/ProxyServer    


******************* others *******************  

// run package in java  
javac *.java  
java -cp . proxy.ProxyServer  
