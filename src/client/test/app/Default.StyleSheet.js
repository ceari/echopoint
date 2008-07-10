echopoint.test.TestApp.StyleSheet = new Echo.StyleSheet({
    "ControlPane": {
        "Row": {
            layoutData: {
                backgroundImage: "image/ControlPaneFill.png",
                overflow: Echo.SplitPane.OVERFLOW_HIDDEN,
                insets: "2px 10px"
            },
            cellSpacing: 20,
            insets: "2px 10px"
        }
    },
    "ControlPane.Button": {
        "Button": {
            lineWrap: false,
            foreground: "#000000",
            rolloverForeground: "#6f0f0f",
            rolloverEnabled: true,
            insets: "0px 8px"
        }
    },
    "ControlPane.Container.Top": {
        "SplitPane": {
            orientation: Echo.SplitPane.ORIENTATION_VERTICAL_TOP_BOTTOM,
            separatorPosition: "30px"
        }
    },
    "ControlPane.Container.Bottom": {
        "SplitPane": {
            orientation: Echo.SplitPane.ORIENTATION_VERTICAL_BOTTOM_TOP,
            separatorPosition: "30px"
        }
    },
    "Default": {
        "AbstractButton": {
            border: "1px outset #709bcd",
            foreground: "#000000",
            backgroundImage: {
                url: "image/InputFieldBackground.png",
                y: "50%"
            },
            pressedBackgroundImage: {
                url: "image/InputFieldBackgroundPressed.png",
                y: "50%"
            },
            pressedBorder: "1px inset #709bcd",
            rolloverBackgroundImage: {
                url: "image/InputFieldBackgroundHighlight.png",
                y: "50%"
            },
            rolloverBorder: "1px outset #bcd6f4",
            pressedEnabled: true,
            rolloverEnabled: true,
            insets: "1px 4px",
            disabledForeground: "#93bed5"
        },
        "AbstractListComponent": {
            border: "2px groove #cfdfff",
            background: "#cfdfff"
        },
        "Extras.AccordionPane": {
            tabBorder: "1px outset #272727",
            tabForeground: "#ffffff",
            tabBackground: "#514f58",
            tabBackgroundImage: "image/TabBackground.png",
            tabRolloverEnabled: true,
            tabRolloverBackground: "#86899a",
            tabRolloverBackgroundImage: "image/TabBackgroundRollover.png"
        },
        "Extras.MenuBarPane": {
            animationTime: 150,
            border: "0px solid #000000",
            backgroundImage: "image/PulldownMenuBackground.png",
            foreground: "#ffffff",
            menuBackground: "#000000",
            menuOpacity: 92,
            menuBackgroundImage: "image/GreyMenuBackground.png",
            menuBorder: {
                top: "1px solid #3f3f3f",
                left: "1px solid #3f3f3f",
                right: "1px solid #1f1f1f",
                bottom: "1px solid #1f1f1f"
            },
            selectionBackground: "#fffac1",
            selectionBackgroundImage: {
                url:"image/BeigeLightedBackground.png",
                x: "50%",
                y: "50%"
            },
            selectionForeground: "#000000"
        },
        "Extras.RichTextArea": {
            controlPaneSplitPaneStyleName: "ControlPane.Container.Bottom",
            controlPaneRowStyleName: "ControlPane",
            controlPaneButtonStyleName: "ControlPane.Button",
            menuStyleName: "RichTextArea.Menu",
            toolbarButtonStyleName: "RichTextArea.Toolbar",
            windowPaneStyleName: "GlassBlue2"
        },
        "TextComponent": {
            background: "#cfdfff",
            border: "2px groove #cfdfff",
            backgroundImage: {
                url: "image/InputFieldBackground.png",
                repeat: "repeat-x",
                y: "50%"
            }
        },
        "WindowPane": {
            ieAlphaRenderBorder: true,
            titleForeground: "#ffffff",
            titleBackground: "#2f2f4f",
            titleInsets: "5px 10px",
            titleBackgroundImage: {
                url: "image/window/simple/Header.png",
                repeat: "repeat-x",
                y: "100%"
            },
            border: {
                contentInsets: "8px 14px 14px 8px",
                borderInsets: "17px 23px 23px 17px",
                topLeft: "image/window/simple/BorderTopLeft.png",
                top: "image/window/simple/BorderTop.png",
                topRight: "image/window/simple/BorderTopRight.png",
                left: "image/window/simple/BorderLeft.png",
                right: "image/window/simple/BorderRight.png",
                bottomLeft: "image/window/simple/BorderBottomLeft.png",
                bottom: "image/window/simple/BorderBottom.png",
                bottomRight: "image/window/simple/BorderBottomRight.png"
            }
        }
    },
    "DefaultResizableLarge": {
        "SplitPane" : {
            separatorHeight: 12,
            separatorWidth: 12,
            resizable: true,
            separatorHorizontalImage: {
                url: "image/SplitPaneHorizontalSeparatorLarge.png",
                y: "50%"
            },
            separatorVerticalImage: {
                url: "image/SplitPaneVerticalSeparatorLarge.png",
                x: "50%"
            }
        }
    },
    "LaunchPanel": {
        "Button": {
            alignment: "center",
            background: "#1f1f1f",
            textAlignment: "center",
            textPosition: "bottom",
            rolloverEnabled: true,
            rolloverBackground: "#5c5c5c",
            foreground: "#ffffff",
            font: { size: "9pt" },
            iconTextMargin: 2,
            insets: 10,
            pressedBackground: "#4d4d4d",
            pressedEnabled: true,
            border: "2px groove #3d3d3d",
            pressedBorder: "2px inset #3d3d3d"
        },
        "Column": {
            cellSpacing: 8
        }
    },
    "LaunchPanel.Selected": {
        "Button": {
            alignment: "center",
            textAlignment: "center",
            textPosition: "bottom",
            foreground: "#ffffff",
            backgroundImage: "image/DemoSelectButtonSelectedBackground.png",
            font: { size: "9pt" },
            iconTextMargin: 2,
            insets: 10,
            border: "2px groove #3d3d3d"
        }
    },
    "GlassBlue": {
        "WindowPane": {
            ieAlphaRenderBorder: true,
            titleFont: {
                size: "10pt",
                bold: true,
                italic: true
            },
            titleForeground: "#ffffff",
            titleInsets: "5px 10px",
            titleBackgroundImage: {
                url: "image/window/glassblue/Header.png",
                repeat: "repeat-x",
                y: "100%"
            },
            border: {
                contentInsets: "6px 15px 15px 12px",
                borderInsets: "34px 20px 20px 20px",
                topLeft: "image/window/glassblue/BorderTopLeft.png",
                top: "image/window/glassblue/BorderTop.png",
                topRight: "image/window/glassblue/BorderTopRight.png",
                left: "image/window/glassblue/BorderLeft.png",
                right: "image/window/glassblue/BorderRight.png",
                bottomLeft: "image/window/glassblue/BorderBottomLeft.png",
                bottom: "image/window/glassblue/BorderBottom.png",
                bottomRight: "image/window/glassblue/BorderBottomRight.png"
            }
        }
    },
    "GlassBlue2": {
        "WindowPane": {
            ieAlphaRenderBorder: true,
            titleFont: {
                size: "10pt",
                bold: true,
                italic: true
            },
            titleForeground: "#ffffff",
            titleInsets: "5px 10px",
            titleBackgroundImage: {
                url: "image/window/glassblue2/Header.png",
                repeat: "repeat-x",
                y: "100%"
            },
            border: {
                contentInsets: "6px 15px 15px 12px",
                borderInsets: "34px 20px 20px 20px",
                topLeft: "image/window/glassblue2/BorderTopLeft.png",
                top: "image/window/glassblue2/BorderTop.png",
                topRight: "image/window/glassblue2/BorderTopRight.png",
                left: "image/window/glassblue2/BorderLeft.png",
                right: "image/window/glassblue2/BorderRight.png",
                bottomLeft: "image/window/glassblue2/BorderBottomLeft.png",
                bottom: "image/window/glassblue2/BorderBottom.png",
                bottomRight: "image/window/glassblue2/BorderBottomRight.png"
            }
        }
    },
    "Layout.Bordered": {
        "Grid": {
            width: "100%",
            insets: "3px 8px",
            background: "#ffffff",
            border: "2px groove #7ea4d3"
        }
    },
    "Junior": {
        "Extras.ColorSelect": {
            hueWidth: 10,
            saturationHeight: 60,
            valueWidth: 60
        }
    },
    "Photo.Countryside": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Countryside.jpg",
                x: -1,
                y: "100%"
            }
        }
    },
    "Photo.Coral": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Coral.jpg",
                x: 300,
                y: "50%"
            }
        }
    },
    "Photo.EarthEast": {
        "ContentPane": {
            background: "#000000",
            backgroundImage: {
                url: "image/bgpictures/EarthEast.jpg",
                y: "100%",
                repeat: "no-repeat"
            }
        }
    },
    "Photo.EarthWest": {
        "ContentPane": {
            background: "#000000",
            backgroundImage: {
                url: "image/bgpictures/EarthWest.jpg",
                y: "100%",
                repeat: "no-repeat"
            }
        }
    },
    "Photo.Fern": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Fern.jpg",
                x: "50%",
                y: "50%"
            }
        }
    },
    "Photo.Leaf": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Leaf.jpg",
                x: "50%",
                y: "50%"
            }
        }
    },
    "Photo.Moonlight": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Moonlight.jpg",
                x: -1,
                y: -1
            }
        }
    },
    "Photo.Poinsettia": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Poinsettia.jpg",
                x: -1,
                y: "70%"
            }
        }
    },
    "Photo.Winter": {
        "ContentPane": {
            backgroundImage: {
                url: "image/bgpictures/Winter.jpg",
                x: -1,
                y: -1
            }
        }
    },
    "PhotoAlbum": {
        "Button": {
            insets: 3,
            foreground: "#ffffff",
            rolloverEnabled: true,
            rolloverBackground: "#000000",
            rolloverForeground: "#fffed0",
            alignment: "center",
            textAlignment: "center",
            textPosition: "bottom",
            iconTextMargin: 1,
            layoutData: {
                alignment: "center"
            }
        }
    },
    "PreferencesColumn": {
        "Column": {
            border: {
                left: "1px solid #afafaf",
                top: "1px solid #afafaf",
                right: "1px solid #dfdfdf",
                bottom: "1px solid #dfdfdf"
            },
            cellSpacing: 8,
            insets: "8px 20px"
        }
    },
    "PreferencesTitle": {
        "Label": {
            foreground: "#2f2faf",
            font: { bold: true }
        }
    },
    "RichTextArea.Menu": {
        "Extras.MenuBarPane": {
            backgroundImage: "image/BlueLineBackground.png",
            menuBackgroundIamge: "image/LightBlueLineBackground.png",
            selectionBackgroundImage: "image/ShadowBackgroundDarkBlue2.png"
        }
    },
    "RichTextArea.Toolbar": {
        "Button": {
            background: "#cfcfdf",
            foreground: "#000000",
            border: "1px outset #cfcfdf",
            rolloverEnabled: true,
            rolloverBackground: "#efefff",
            rolloverBorder: "1px outset #efefff",
            pressedEnabled: true,
            pressedBackground: "#afafbf",
            pressedBorder: "1px inset #afafbf",
            insets: "1px 3px"
        }
    },
    "TransGreen": {
        "WindowPane": {
            ieAlphaRenderBorder: true,
            titleFont: {
                size: "10pt",
                bold: true,
                italic: true
            },
            titleForeground: "#ffffff",
            titleInsets: "5px 10px",
            titleBackgroundImage: {
                url: "image/window/transgreen/Header.png",
                repeat: "repeat-x",
                y: "100%"
            },
            border: {
                contentInsets: "6px 15px 15px 12px",
                borderInsets: "34px 20px 20px 20px",
                topLeft: "image/window/transgreen/BorderTopLeft.png",
                top: "image/window/transgreen/BorderTop.png",
                topRight: "image/window/transgreen/BorderTopRight.png",
                left: "image/window/transgreen/BorderLeft.png",
                right: "image/window/transgreen/BorderRight.png",
                bottomLeft: "image/window/transgreen/BorderBottomLeft.png",
                bottom: "image/window/transgreen/BorderBottom.png",
                bottomRight: "image/window/transgreen/BorderBottomRight.png"
            }
        }
    }
});