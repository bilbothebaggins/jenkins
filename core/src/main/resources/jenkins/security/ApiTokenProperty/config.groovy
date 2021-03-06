/*
 * The MIT License
 *
 * Copyright (c) 2011, CloudBees, Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package jenkins.security.ApiTokenProperty;

f=namespace(lib.FormTagLib)

f.advanced(title:_("Show API Token"), align:"left") {
    f.entry(title:_("API Token"), field:"apiToken") {
        f.readOnlyTextbox(id:"apiToken") // TODO: need to figure out the way to do this without using ID.
    }
    f.validateButton(title:_("Change API Token"),method:"changeToken")
}

//f.entry(title:_("API Token"),field:"apiToken") {
//raw("""
//<a href="#" class='showDetails'>${_("Show API token")}</a><div style="display:none">
//""")
//    f.readOnlyTextbox()
//raw("""
//</div>
//""")
//}
//
//f.validateButton(title:"") {
//
//}
//
