# Convert files to PDF using Ruby
:exclamation:
This repository is a barebones sample implementation of Nutrient Document Converter Services (formerly Muhimbi PDF Converter Services), built purely with demo purposes in mind. This example has not been designed to run unmodified in production.

The Ruby sample provided in this section uses the *[Muhimbi PDF Converter Services](http://www.muhimbi.com/Products/PDF-Converter-Services/summary.aspx)* to convert a file to PDF.  Additional sample code to convert, merge, watermark, secure and OCR files [can be found here](../).

A detailed blog post, including details about how to setup Ruby, including all prerequisites, can be found on our [Blog](http://blog.muhimbi.com/2013/03/use-ruby-on-rails-to-convert-merge-and.html).

:exclamation:
Please note that this example was written in the Ruby 1.8.7 / Rails 3.2.12 (2013) time-frame. Things have moved on since that time and you may find that for more recent Ruby versions you need a different Web Services Framework. However, the concept remains the same, you use a tool to generate proxy classes for the web service, then invoke those proxy classes from your Ruby code.
:exclamation:

The files of main interest are

* [lib/DocumentConverterService*.rb](lib/) - Various Web Service proxy classes automatically generated based on the WSDL explosed by the Muhimbi Conversion Service.
* [config/routes.rb](config/routes.rb) - Standard *routes* files for this simple example.
* [app/views/home/upload_file.html.erb](app/views/home/upload_file.html.erb) - HTML for the form that allows files to be uploaded (for conversion).
* [app/controllers/home_controller.rb](app/controllers/home_controller.rb) - Ruby code that takes the uploaded file and send it to the PDF Conversion Service.


<br/>

Any questions? [Drop us a line](http://www.muhimbi.com/contact.aspx), we love to help.

