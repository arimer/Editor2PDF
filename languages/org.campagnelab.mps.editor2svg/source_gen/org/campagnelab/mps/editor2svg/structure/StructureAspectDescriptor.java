package org.campagnelab.mps.editor2svg.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.runtime.interpreted.StructureAspectInterpreted;

public class StructureAspectDescriptor implements jetbrains.mps.smodel.runtime.StructureAspectDescriptor {
  public StructureAspectDescriptor() {
  }

  public ConceptDescriptor getDescriptor(String conceptFqName) {
    switch (Arrays.binarySearch(stringSwitchCases_1htk8d_a0a0b, conceptFqName)) {
      case 0:
        return new ConceptDescriptorBuilder("org.campagnelab.mps.editor2svg.structure.DefaultOutputDirectory").super_("org.campagnelab.mps.editor2svg.structure.DiagramOutputDirectory").parents("org.campagnelab.mps.editor2svg.structure.DiagramOutputDirectory").create();
      case 1:
        return new ConceptDescriptorBuilder("org.campagnelab.mps.editor2svg.structure.DiagramOutputDirectory").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").properties("path").alias("Output", "Output directory for SVG Renderings").create();
      case 2:
        return new ConceptDescriptorBuilder("org.campagnelab.mps.editor2svg.structure.DiagramRef").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept").references("diagram").create();
      case 3:
        return new ConceptDescriptorBuilder("org.campagnelab.mps.editor2svg.structure.EditorAnnotation").super_("jetbrains.mps.lang.core.structure.NodeAttribute").parents("jetbrains.mps.lang.core.structure.NodeAttribute", "jetbrains.mps.lang.core.structure.INamedConcept").properties("outputFormat").references("editor", "outputTo").create();
      case 4:
        return new ConceptDescriptorBuilder("org.campagnelab.mps.editor2svg.structure.SvgCollection").super_("jetbrains.mps.lang.core.structure.BaseConcept").parents("jetbrains.mps.lang.core.structure.BaseConcept", "jetbrains.mps.lang.core.structure.INamedConcept").children(new String[]{"diagrams"}, new boolean[]{true}).alias("svg-collection", "Collection of SVG editor annotations").create();
      default:
        return StructureAspectInterpreted.getInstance().getDescriptor(conceptFqName);
    }
  }

  private static String[] stringSwitchCases_1htk8d_a0a0b = new String[]{"org.campagnelab.mps.editor2svg.structure.DefaultOutputDirectory", "org.campagnelab.mps.editor2svg.structure.DiagramOutputDirectory", "org.campagnelab.mps.editor2svg.structure.DiagramRef", "org.campagnelab.mps.editor2svg.structure.EditorAnnotation", "org.campagnelab.mps.editor2svg.structure.SvgCollection"};
}
