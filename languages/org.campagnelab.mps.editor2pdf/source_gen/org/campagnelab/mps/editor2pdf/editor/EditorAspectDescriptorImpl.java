package org.campagnelab.mps.editor2pdf.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Arrays;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  public Collection<ConceptEditor> getEditors(ConceptDescriptor descriptor) {
    switch (Arrays.binarySearch(stringSwitchCases_xbvbvu_a0a0a, descriptor.getConceptFqName())) {
      case 0:
        return collectEditors(descriptor, Collections.<ConceptEditor>singletonList(new DiagramOutputDirectory_Editor()));
      case 1:
        return collectEditors(descriptor, Collections.<ConceptEditor>singletonList(new DiagramRef_Editor()));
      case 2:
        return collectEditors(descriptor, Collections.<ConceptEditor>singletonList(new EditorAnnotation_Editor()));
      case 3:
        return collectEditors(descriptor, Collections.<ConceptEditor>singletonList(new PdfCollection_Editor()));
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorComponent> getEditorComponents(ConceptDescriptor descriptor, String editorComponentId) {
    return Collections.<ConceptEditorComponent>emptyList();
  }


  private static String[] stringSwitchCases_xbvbvu_a0a0a = new String[]{"org.campagnelab.mps.editor2pdf.structure.DiagramOutputDirectory", "org.campagnelab.mps.editor2pdf.structure.DiagramRef", "org.campagnelab.mps.editor2pdf.structure.EditorAnnotation", "org.campagnelab.mps.editor2pdf.structure.PdfCollection"};
}
