package com.github.tomtung.latex2unicode.helper

object Escape {
  val escapes = Map(
    "\\&" -> "&",
    "\\$" -> "$",
    "\\{" -> "{",
    "\\}" -> "}",
    "\\%" -> "%",
    "\\#" -> "#",
    "\\_" -> "_",
    "$" -> "", // Ignore $

    "~" -> " ",
    "\\;" -> " ",
    "\\:" -> " ",
    "\\," -> " ",
    "\\quad" -> " ",
    "\\qquad" -> " ",
    """\\""" -> "\n",
    "-" -> "\u2212",
    "--" -> "\u2013",
    "---" -> "\u2014",
    "\\colon" -> ":",
    "\\lbrack" -> "[",
    "\\rbrack" -> "]",
    "\\textasciicircum" -> "^",
    "\\textbackslash" -> "\\",
    "\\textless" -> "<",
    "\\textgreater" -> ">",
    "\\textbar" -> "|",
    "\\textasciitilde" -> "~",
    "\\textunderscore" -> "_",
    "\\textendash" -> "–",
    "\\texttrademark" -> "™",
    "\\textexclamdown" -> "¡",
    "\\textemdash" -> "—",
    "\\textregistered" -> "®",
    "\\textquestiondown" -> "¿",
    "\\textvisiblespace" -> "␣",

    // Greek alphabet
    "\\alpha" -> "α",
    "\\beta" -> "β",
    "\\Gamma" -> "Γ",
    "\\gamma" -> "γ",
    "\\Delta" -> "Δ",
    "\\delta" -> "δ",
    "\\zeta" -> "ζ",
    "\\eta" -> "η",
    "\\Theta" -> "Θ",
    "\\theta" -> "θ",
    "\\Iota" -> "Ι",
    "\\iota" -> "ι",
    "\\kappa" -> "κ",
    "\\Lambda" -> "Λ",
    "\\lambda" -> "λ",
    "\\mu" -> "μ",
    "\\Nu" -> "Ν",
    "\\nu" -> "ν",
    "\\Xi" -> "Ξ",
    "\\xi" -> "ξ",
    "\\Pi" -> "Π",
    "\\pi" -> "π",
    "\\rho" -> "ρ",
    "\\Sigma" -> "Σ",
    "\\sigma" -> "σ",
    "\\tau" -> "τ",
    "\\Upsilon" -> "Υ",
    "\\upsilon" -> "υ",
    "\\Phi" -> "Φ",
    "\\phi" -> "φ",
    "\\chi" -> "χ",
    "\\Psi" -> "Ψ",
    "\\psi" -> "ψ",
    "\\Omega" -> "Ω",
    "\\omega" -> "ω",
    "\\P" -> "¶",
    "\\S" -> "§",
    "\\|" -> "‖",
    "\\wr" -> "≀",
    "\\wp" -> "℘",
    "\\wedge" -> "∧",
    "\\veebar" -> "⊻",
    "\\vee" -> "∨",
    "\\vdots" -> "⋮",
    "\\vdash" -> "⊢",
    "\\vartriangleright" -> "⊳",
    "\\vartriangleleft" -> "⊲",
    "\\vartriangle" -> "△",
    "\\vartheta" -> "ϑ",
    "\\varsigma" -> "ς",
    "\\varrho" -> "ϱ",
    "\\varpropto" -> "∝",
    "\\varpi" -> "ϖ",
    "\\varphi" -> "ϕ",
    "\\varnothing" -> "∅",
    "\\varkappa" -> "ϰ",
    "\\varepsilon" -> "ε",
    "\\vDash" -> "⊨",
    "\\upuparrows" -> "⇈",
    "\\uplus" -> "⊎",
    "\\upharpoonright" -> "↾",
    "\\upharpoonleft" -> "↿",
    "\\updownarrow" -> "↕",
    "\\uparrow" -> "↑",
    "\\unrhd" -> "⊵",
    "\\unlhd" -> "⊴",
    "\\twoheadrightarrow" -> "↠",
    "\\twoheadleftarrow" -> "↞",
    "\\trianglerighteq" -> "⊵",
    "\\triangleright" -> "▷",
    "\\triangleq" -> "≜",
    "\\trianglelefteq" -> "⊴",
    "\\triangleleft" -> "◁",
    "\\triangledown" -> "▽",
    "\\triangle" -> "△",
    "\\top" -> "⊤",
    "\\times" -> "×",
    "\\thicksim" -> "∼",
    "\\thickapprox" -> "≈",
    "\\therefore" -> "∴",
    "\\swarrow" -> "↙",
    "\\surd" -> "√",
    "\\supseteq" -> "⊇",
    "\\supsetneq" -> "⊋",
    "\\supset" -> "⊃",
    "\\sum" -> "∑",
    "\\succsim" -> "≿",
    "\\succeq" -> "≽",
    "\\succcurlyeq" -> "≽",
    "\\succ" -> "≻",
    "\\subseteq" -> "⊆",
    "\\subsetneq" -> "⊊",
    "\\subset" -> "⊂",
    "\\star" -> "⋆",
    "\\square" -> "□",
    "\\sqsupseteq" -> "⊒",
    "\\sqsupset" -> "⊐",
    "\\sqsubseteq" -> "⊑",
    "\\sqsubset" -> "⊏",
    "\\sqcup" -> "⊔",
    "\\sqcap" -> "⊓",
    "\\sphericalangle" -> "∢",
    "\\spadesuit" -> "♠",
    "\\smile" -> "⌣",
    "\\smallsmile" -> "⌣",
    "\\smallsetminus" -> "∖",
    "\\smallfrown" -> "⌢",
    "\\simeq" -> "≃",
    "\\sim" -> "∼",
    "\\shortparallel" -> "∥",
    "\\sharp" -> "♯",
    "\\setminus" -> "∖",
    "\\searrow" -> "↘",
    "\\rtimes" -> "⋈",
    "\\risingdotseq" -> "≓",
    "\\rightthreetimes" -> "⋌",
    "\\rightsquigarrow" -> "⇝",
    "\\rightrightarrows" -> "⇉",
    "\\rightleftharpoons" -> "⇌",
    "\\rightleftarrows" -> "⇄",
    "\\rightharpoonup" -> "⇀",
    "\\rightharpoondown" -> "⇁",
    "\\rightarrowtail" -> "↣",
    "\\to" -> "→",
    "\\rightarrow" -> "→",
    "\\rhd" -> "⊳",
    "\\rfloor" -> "⌋",
    "\\rceil" -> "⌉",
    "\\rangle" -> "〉",
    "\\propto" -> "∝",
    "\\prod" -> "∏",
    "\\prime" -> "′",
    "\\precsim" -> "≾",
    "\\preceq" -> "≼",
    "\\preccurlyeq" -> "≼",
    "\\prec" -> "≺",
    "\\pm" -> "±",
    "\\pitchfork" -> "⋔",
    "\\perp" -> "⊥",
    "\\partial" -> "∂",
    "\\parallel" -> "∥",
    "\\otimes" -> "⊗",
    "\\oslash" -> "⊘",
    "\\oplus" -> "⊕",
    "\\ominus" -> "⊖",
    "\\oint" -> "∮",
    "\\odot" -> "⊙",
    "\\nwarrow" -> "↖",
    "\\notin" -> "∉",
    "\\ni" -> "∋",
    "\\nexists" -> "∄",
    "\\neq" -> "≠",
    "\\neg" -> "¬",
    "\\lnot" -> "¬",
    "\\nearrow" -> "↗",
    "\\natural" -> "♮",
    "\\nabla" -> "∇",
    "\\multimap" -> "⊸",
    "\\mp" -> "∓",
    "\\models" -> "⊨",
    "\\mid" -> "∣",
    "\\mho" -> "℧",
    "\\mho" -> "℧",
    "\\measuredangle" -> "∡",
    "\\mapsto" -> "↦",
    "\\ltimes" -> "⋉",
    "\\lozenge" -> "◊",
    "\\looparrowright" -> "↬",
    "\\looparrowleft" -> "↫",
    "\\longrightarrow" -> "→",
    "\\longmapsto" -> "⇖",
    "\\longleftrightarrow" -> "↔",
    "\\longleftarrow" -> "←",
    "\\lll" -> "⋘",
    "\\ll" -> "≪",
    "\\lhd" -> "⊲",
    "\\lfloor" -> "⌊",
    "\\lesssim" -> "≲",
    "\\lessgtr" -> "≶",
    "\\lesseqgtr" -> "⋚",
    "\\lessdot" -> "⋖",
    "\\leqslant" -> "≤",
    "\\leqq" -> "≦",
    "\\leq" -> "≤",
    "\\leftthreetimes" -> "⋋",
    "\\leftrightsquigarrow" -> "↭",
    "\\leftrightharpoons" -> "⇋",
    "\\leftrightarrows" -> "⇆",
    "\\leftrightarrow" -> "↔",
    "\\leftleftarrows" -> "⇇",
    "\\leftharpoonup" -> "↼",
    "\\leftharpoondown" -> "↽",
    "\\leftarrowtail" -> "↢",
    "\\gets" -> "←",
    "\\leftarrow" -> "←",
    "\\leadsto" -> "↝",
    "\\le" -> "≤",
    "\\lceil" -> "⌈",
    "\\langle" -> "〈",
    "\\intercal" -> "⊺",
    "\\int" -> "∫",
    "\\iint" -> "∬",
    "\\iiint" -> "∭",
    "\\iiiint" -> "⨌",
    "\\infty" -> "∞",
    "\\in" -> "∈",
    "\\implies" -> "⇒",
    "\\hslash" -> "ℏ",
    "\\hookrightarrow" -> "↪",
    "\\hookleftarrow" -> "↩",
    "\\heartsuit" -> "♡",
    "\\hbar" -> "ℏ",
    "\\hbar" -> "ℏ",
    "\\gtrsim" -> "≳",
    "\\gtrless" -> "≷",
    "\\gtreqless" -> "⋛",
    "\\gtrdot" -> "⋗",
    "\\gimel" -> "ג",
    "\\ggg" -> "⋙",
    "\\gg" -> "≫",
    "\\geqq" -> "≧",
    "\\geq" -> "≥",
    "\\ge" -> "≥",
    "\\frown" -> "⌢",
    "\\forall" -> "∀",
    "\\flat" -> "♭",
    "\\fallingdotseq" -> "≒",
    "\\exists" -> "∃",
    "\\eth" -> "ð",
    "\\equiv" -> "≡",
    "\\eqcirc" -> "≖",
    "\\epsilon" -> "∊",
    "\\Epsilon" -> "Ε",
    "\\emptyset" -> "∅",
    "\\ell" -> "ℓ",
    "\\downharpoonright" -> "⇂",
    "\\downharpoonleft" -> "⇃",
    "\\downdownarrows" -> "⇊",
    "\\downarrow" -> "↓",
    "\\dots" -> "…",
    "\\ldots" -> "…",
    "\\dotplus" -> "∔",
    "\\doteqdot" -> "≑",
    "\\doteq" -> "≐",
    "\\divideontimes" -> "⋇",
    "\\div" -> "÷",
    "\\digamma" -> "Ϝ",
    "\\diamondsuit" -> "♢",
    "\\diamond" -> "⋄",
    "\\ddots" -> "⋱",
    "\\ddag" -> "‡",
    "\\ddagger" -> "‡",
    "\\dashv" -> "⊣",
    "\\dashrightarrow" -> "⇢",
    "\\dashleftarrow" -> "⇠",
    "\\daleth" -> "ד",
    "\\dag" -> "†",
    "\\dagger" -> "†",
    "\\textdagger" -> "†",
    "\\curvearrowright" -> "↷",
    "\\curvearrowleft" -> "↶",
    "\\curlywedge" -> "⋏",
    "\\curlyvee" -> "⋎",
    "\\curlyeqsucc" -> "⋟",
    "\\curlyeqprec" -> "⋞",
    "\\cup" -> "∪",
    "\\coprod" -> "∐",
    "\\cong" -> "≅",
    "\\complement" -> "∁",
    "\\colon" -> ":",
    "\\clubsuit" -> "♣",
    "\\circleddash" -> "⊝",
    "\\circledcirc" -> "⊚",
    "\\circledast" -> "⊛",
    "\\circledS" -> "Ⓢ",
    "\\circlearrowright" -> "↻",
    "\\circlearrowleft" -> "↺",
    "\\circeq" -> "≗",
    "\\circ" -> "∘",
    "\\centerdot" -> "⋅",
    "\\cdots" -> "⋯",
    "\\cdot" -> "⋅",
    "\\cap" -> "∩",
    "\\bumpeq" -> "≏",
    "\\bullet" -> "∙",
    "\\boxtimes" -> "⊠",
    "\\boxplus" -> "⊞",
    "\\boxminus" -> "⊟",
    "\\boxdot" -> "⊡",
    "\\bowtie" -> "⋈",
    "\\bot" -> "⊥",
    "\\blacktriangleright" -> "▷",
    "\\blacktriangleleft" -> "◀",
    "\\blacktriangledown" -> "▼",
    "\\blacktriangle" -> "▲",
    "\\blacksquare" -> "■",
    "\\blacklozenge" -> "◆",
    "\\bigwedge" -> "⋀",
    "\\bigvee" -> "⋁",
    "\\biguplus" -> "⊎",
    "\\bigtriangleup" -> "△",
    "\\bigtriangledown" -> "▽",
    "\\bigstar" -> "★",
    "\\bigsqcup" -> "⊔",
    "\\bigotimes" -> "⊗",
    "\\bigoplus" -> "⊕",
    "\\bigodot" -> "⊙",
    "\\bigcup" -> "⋃",
    "\\bigcirc" -> "○",
    "\\bigcap" -> "⋂",
    "\\between" -> "≬",
    "\\beth" -> "ב",
    "\\because" -> "∵",
    "\\barwedge" -> "⊼",
    "\\backsim" -> "∽",
    "\\backprime" -> "‵",
    "\\backepsilon" -> "∍",
    "\\asymp" -> "≍",
    "\\ast" -> "∗",
    "\\approxeq" -> "≊",
    "\\approx" -> "≈",
    "\\angle" -> "∠",
    "\\angle" -> "∠",
    "\\aleph" -> "א",
    "\\Vvdash" -> "⊪",
    "\\Vdash" -> "⊩",
    "\\Updownarrow" -> "⇕",
    "\\Uparrow" -> "⇑",
    "\\Supset" -> "⋑",
    "\\Subset" -> "⋐",
    "\\Rsh" -> "↱",
    "\\Rrightarrow" -> "⇛",
    "\\Rightarrow" -> "⇒",
    "\\Re" -> "ℜ",
    "\\Lsh" -> "↰",
    "\\Longrightarrow" -> "⇒",
    "\\iff" -> "⇔",
    "\\Longleftrightarrow" -> "⇔",
    "\\Longleftarrow" -> "⇐",
    "\\Lleftarrow" -> "⇚",
    "\\Leftrightarrow" -> "⇔",
    "\\Leftarrow" -> "⇐",
    "\\Join" -> "⋈",
    "\\Im" -> "ℑ",
    "\\Finv" -> "Ⅎ",
    "\\Downarrow" -> "⇓",
    "\\Diamond" -> "◇",
    "\\Cup" -> "⋓",
    "\\Cap" -> "⋒",
    "\\Bumpeq" -> "≎",
    "\\Box" -> "□",
    "\\ae" -> "æ",
    "\\AE" -> "Æ",
    "\\oe" -> "œ",
    "\\OE" -> "Œ",
    "\\aa" -> "å",
    "\\AA" -> "Å",
    "\\dh" -> "ð",
    "\\DH" -> "Ð",
    "\\dj" -> "đ",
    "\\DJ" -> "Ð",
    "\\o" -> "ø",
    "\\O" -> "Ø",
    "\\i" -> "ı",
    "\\imath" -> "ı",
    "\\j" -> "ȷ",
    "\\jmath" -> "ȷ",
    "\\L" -> "Ł",
    "\\l" -> "ł",
    "\\ss" -> "ß",
    "\\aleph" -> "ℵ",
    "\\copyright" -> "©",
    "\\pounds" -> "£",
    "\\euro" -> "€",
    "\\EUR" -> "€",
    "\\texteuro" -> "€"
  )

  val names: Set[String] = escapes.keySet

  def translate(name: String): String = {
    if (!names.contains(name)) {
      throw new IllegalArgumentException(s"Unknown command: $name")
    }

    escapes(name)
  }

}
