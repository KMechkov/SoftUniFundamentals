// <copyright file="Program.cs" company="company">
// product
// Copyright (c) 2004-2010
// by company ( http://www.example.com )
// </copyright>

namespace BeforeRrefactoring
{
    using System;
    using System.Collections.Generic;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    /// <summary>
    /// This is class Program
    /// </summary>
    public class Program
    {
        /// <summary>
        /// field for fileName
        /// </summary>
        private const string FileName = "example.bin";

        /// <summary>
        /// This is main method.
        /// </summary>
        public static void Main()
        {
            FileStream fileStream = new FileStream(FileName, FileMode.CreateNew);

            // Create the writer for data.
            BinaryWriter writer = new BinaryWriter(fileStream);

            // Write data to Test.data.
            for (int i = 0; i < 11; i++)
            {
                writer.Write((int)i);
            }

            writer.Close();
            fileStream.Close();

            // Create the reader for data.
            fileStream = new FileStream(FileName, FileMode.Open, FileAccess.Read);
            BinaryReader reader = new BinaryReader(fileStream); // Read data from  Test.data.

            for (int i = 0; i < 11; i++)
            {
                Console.WriteLine(reader.ReadInt32());
            }

            reader.Close();
            fileStream.Close();
        }
    }
}