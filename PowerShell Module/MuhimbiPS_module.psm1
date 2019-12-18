<#
    .SYNOPSIS
        A simple module that uses dot sourcing to load the functions.

    .DESCRIPTION
        When this module is imported, the functions are loaded using dot sourcing.
#>

    #** Get the path to the folder of the function files
    $functionPath = $PSScriptRoot + "\function\"

    #** Get a list of all the function file names
    $functionList = Get-ChildItem -Path $functionPath -Name 

    #** Loop through all the files and dot source them into memory
    foreach ($function in $functionList)
    {
        . ($functionPath + $function)
    }

    #** Hide helper functions not following the Verb-Noun naming convention
    Export-ModuleMember *-*