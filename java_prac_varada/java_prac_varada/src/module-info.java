module varada {
    requires java.desktop;
    exports ModulesInjava; //makes this package available to all
}
//we can create multiple modules inside a modular aaplication and can create packages in these modules which pakcages will consist of the java classes
//src->module A modules B
//module a -> package 1,2 ->class1
//and has module info java at same level of package
//same for module b

//modules in java are compiled through the command prompts