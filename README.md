[![Published on Vaadin  Directory](https://img.shields.io/badge/Vaadin%20Directory-published-00b4f0.svg)](https://vaadin.com/directory/component/app-layout-add-on)
[![Lastest version on vaadin.com/directory](https://img.shields.io/vaadin-directory/version/app-layout-add-on.svg)](https://vaadin.com/directory/component/app-layout-add-on)
[![Stars on vaadin.com/directory](https://img.shields.io/vaadin-directory/rating/app-layout-add-on.svg)](https://vaadin.com/directory/component/app-layout-add-on)
[![Lastest release date on vaadin.com/directory](https://img.shields.io/vaadin-directory/release-date/app-layout-add-on.svg)](https://vaadin.com/directory/component/app-layout-add-on)
[![Build Status](https://dev.azure.com/GoebelJohannes/GoebelJohannes/_apis/build/status/appreciated.vaadin-app-layout?branchName=master)](https://dev.azure.com/GoebelJohannes/GoebelJohannes/_build/latest?definitionId=1&branchName=master)

## Integration of the \<app-layout\> for Vaadin
A collection of ready to use templates for the Webcomponent [\<app-layout\>](https://www.webcomponents.org/element/PolymerElements/app-layout)
<br>
<br>
<br>
![Markup](https://github.com/appreciated/blob/blob/master/app-layout/mockup.png?raw=true "App-Layout Markup")

## [Demo](https://appreciated-collection.herokuapp.com/app-layout/)

## Installation

Add the following lines to you POM
```
<dependency>
   <groupId>com.github.appreciated</groupId>
   <artifactId>app-layout-addon</artifactId>
   <version>LATEST</version>
</dependency>

<!-- Should be there by default
<repository>
   <id>vaadin-addons</id>
   <url>https://maven.vaadin.com/vaadin-addons</url>
</repository> 
--> 
```

Execute the following command in the at the root of your project

```
mvn install
```

## Building and running demo

#### 1. 

```
git clone git@github.com:appreciated/vaadin-app-layout.git
```
#### 2. 

```
cd <project-root-dir>/vaadin-app-layout/
mvn clean install
cd <project-root-dir>/vaadin-app-layout/app-layout-addon
mvn jetty:run
```

To see the demo, navigate to [http://localhost:8080/](http://localhost:8080/)

## Issue tracking

The issues for this add-on are tracked on its github.com page. All bug reports and feature requests are appreciated. 


## Branching information

* `master` the latest version of the app-layout, currently even with `V13`
* `V8` the version for Vaadin 8 -> App-Layout `1.*`
* `V10` the version for Vaadin 10 -> App-Layout `2.*`
* `V13` support is discontinued due to the short support consider to upgrade to Vaadin 14 instead
* `V14` the version for Vaadin 14 -> App-Layout `4.*`

## Contributions

Contributions are welcome, but there are no guarantees that they are accepted as such. Process for contributing is the following:
- Fork this project
- Create an issue to this project about the contribution (bug or feature) if there is no such issue about it already. Try to keep the scope minimal.
- Develop and test the fix or functionality carefully. Only include minimum amount of code needed to fix the issue.
- Refer to the fixed issue in commit
- Send a pull request for the original project
- Comment on the original issue that you have implemented a fix for it

## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

The Java Project vaadin-app-layout is written by Appreciated 

The used Polymer Components are [distributed under the BSD License](https://github.com/Polymer/polymer/blob/master/LICENSE.txt)


# Donations

[You like this Project and want to support me?](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=RH84HC939XQHS)

## Features

...
