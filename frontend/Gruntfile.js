/*global module:false*/

module.exports = function (grunt) {
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        banner: '/*! <%= pkg.title || pkg.name %> - v<%= pkg.version %> - ' +
          '<%= grunt.template.today("yyyy-mm-dd") %>\n' +
          '* Copyright (c) <%= grunt.template.today("yyyy") %> <%= pkg.author.name %> */\n',
        cssmin: {
            css : {
                options: {
                    banner: '<%= banner %>',
                    keepBreaks: true
                },
                files: { 
                    'css/<%= pkg.name %>.min.css' : [
                        'bower_components/bootstrap/dist/css/bootstrap.min.css', 
                        'css/style.css'
                    ]
                }
            }
        },
        uglify: {
            dependencies: {
                src: [
                    'bower_components/jquery/jquery.min.js', 
                    'bower_components/jquery-flot/jquery.flot.js',
                    'bower_components/jquery-flot/jquery.flot.resize.js',
                    'bower_components/knockout/build/output/knockout-latest.js',
                    'bower_components/sammy/lib/min/sammy-latest.min.js',
                    'bower_components/bootstrap/dist/js/bootstrap.min.js',
                    'js/jquery.event.drag-2.2.js',
                    'js/dependencies.js'
                    ],
                dest: 'js/<%= pkg.name %>.min.js'
            },
        },
        copy: {
            bootstrap: {
                files: [
                  { expand: true, cwd: 'vendor/bootstrap/fonts/', src: ['**'], dest: 'fonts/' },
                ]
            }
        }
    });

    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-copy');
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-cssmin');

    grunt.registerTask('default', ['uglify', 'copy', 'cssmin']);
};
