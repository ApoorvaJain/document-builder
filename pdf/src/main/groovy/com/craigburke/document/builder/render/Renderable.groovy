package com.craigburke.document.builder.render

import com.craigburke.document.core.Document
import com.craigburke.document.core.builder.RenderState

/**
 * Trait shared by render elements
 */
trait Renderable {
    boolean fullyParsed = false
    
    abstract void parseUntilHeight(float height)
    abstract float getTotalHeight()
    abstract float getParsedHeight()
    abstract void render(Document document, RenderState renderState)

}