// Captura de datos:

Console.WriteLine("Ingrese nombre:");
string? nombre = Console.ReadLine();

Console.WriteLine("Ingrese auto:");
string? auto = Console.ReadLine();

Guid id = Guid.NewGuid();

// Salida de datos:

string datos = $"Los datos del ID {id} son: {nombre} y {auto}.\nSe almacena en outputFile.txt";
Console.WriteLine("\n" + datos);

await File.WriteAllTextAsync("outputFile.txt", $"id: {id}\nnombre: {nombre}\nauto: {auto}");

