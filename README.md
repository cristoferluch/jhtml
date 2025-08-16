
# JHTML

### ⭐ Overview

This project provides a fluent API for building HTML elements in Java, with support for:

- Hierarchical element creation
- Attribute management
- HTML code generation

### 🛠️Usage Example

```java
div(
    h1("Title").id("main-title"),
    p("Example paragraph").style("color: blue;")
).attr("class", "container").build()
```

#### HTML Output
```html
<div class="container">
    <h1 id="main-title">Title</h1>
    <p style="color: blue;">Example paragraph</p>
</div>
```

### 🎯Available Methods

- `attr(String name, Object value)` - Adds or modifies an attribute. Accepts any value type (converted to String)  
- `clear()` - Removes all attributes from the element  
- `build()` - Returns the HTML as a String  
- `build(StringBuilder sb)` - Appends HTML to a StringBuilder (efficient for large documents)  
- `build(PrintWriter out)` - Generates the complete HTML in memory first, then writes it to the PrintWriter in a single operation at the end

### 👀Project Structure

```
├───src
│   ├───main
│   │   ├───html
│   │   │       index.html
│   │   │
│   │   ├───java
│   │   │   └───org
│   │   │       └───example
│   │   │           │   Main.java
│   │   │           │
│   │   │           ├───attributes
│   │   │           │       ButtonAttributes.java
│   │   │           │       EventsAttributes.java
│   │   │           │       FormAttributes.java
│   │   │           │       ...
│   │   │           │
│   │   │           ├───elements
│   │   │           │       Body.java
│   │   │           │       Button.java
│   │   │           │       Dialog.java
│   │   │           │       ...
│   │   │           │
│   │   │           └───core
│   │   │                   HtmlAttribute.java
│   │   │                   HtmlElement.java
│   │   │                   HtmlFactory.java
```

### 🎨Elements

- `div`
- `input`
- `a`
- `body`
- `form`
- `table`
- `tr`
- `td`
- `th`
- `button`
- `html`
- `img`
- `dialog`
- `head`
- `title`
- `label`
- `link`
- `p`
- `span`
- `thead`
- `tbody`
- `tfoot`
- `select`
- `option`
- `textarea`
- `h1`
- `h2`
- `h3`
- `h4`
- `h5`
- `h6`
- `script`
- `meta`