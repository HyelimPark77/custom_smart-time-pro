.class public Lcom/sma/smartv3/ui/musicpicker/OXO1;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"

# interfaces
.implements Lcom/l4digital/fastscroll/FastScroller$OIi0;
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;,
        Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;",
        "Lcom/l4digital/fastscroll/FastScroller$OIi0;",
        "Landroid/widget/Filterable;"
    }
.end annotation


# instance fields
.field public I1:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;"
        }
    .end annotation
.end field

.field public IO:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;"
        }
    .end annotation
.end field

.field public X11iII1O1:Ljava/lang/String;

.field public XXX11i:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

.field public iX1O1:Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;Ljava/util/List;Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "builder",
            "musicItemList",
            "listener"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;",
            "Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->XXX11i:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    iput-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I1:Ljava/util/List;

    iput-object p3, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/ui/musicpicker/OXO1;I)Lcom/android/mltcode/paycertificationapi/fw0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO(I)Lcom/android/mltcode/paycertificationapi/fw0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/ui/musicpicker/OXO1;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/ui/musicpicker/OXO1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->X11iII1O1:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/ui/musicpicker/OXO1;Ljava/util/List;J)I
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->getItemPosition(Ljava/util/List;J)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/ui/musicpicker/OXO1;)Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->XXX11i:Lcom/sma/smartv3/ui/musicpicker/MusicPicker$Builder;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/ui/musicpicker/OXO1;)Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/ui/musicpicker/OXO1;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I1:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/ui/musicpicker/OXO1;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->getFilteredResults(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/ui/musicpicker/OXO1;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public I0iXXO()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->OIX0iXi()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->OIX0iXi()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final IO(I)Lcom/android/mltcode/paycertificationapi/fw0;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "pos"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/fw0;

    return-object p1
.end method

.method public OIX0iXi()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/fw0;->IIX1OXO()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public XXI(J)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-virtual {p0, v0, p1, p2}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->getItemPosition(Ljava/util/List;J)I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/mltcode/paycertificationapi/fw0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->IIX1OXO()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/fw0;->X01IiOiIi(Z)V

    return-void
.end method

.method public filterOnText(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "query"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->X11iII1O1:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->getFilter()Landroid/widget/Filter;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->X11iII1O1:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/musicpicker/OXO1;)V

    return-object v0
.end method

.method public final getFilteredResults(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "constraint"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I1:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/fw0;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final getItemPosition(Ljava/util/List;J)I
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "list",
            "mid"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/android/mltcode/paycertificationapi/fw0;",
            ">;J)I"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/fw0;->OIX0iXi()J

    move-result-wide v1

    cmp-long v1, v1, p2

    if-nez v1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic getSectionText(I)Ljava/lang/CharSequence;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "position"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->getSectionText(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getSectionText(I)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "position"
        }
    .end annotation

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/fw0;->getTitle()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    .line 3
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 4
    const-string p1, ""

    return-object p1
.end method

.method public final highlightTerm(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "tv",
            "query",
            "originalString"
        }
    .end annotation

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    new-instance v6, Landroid/content/res/ColorStateList;

    const/4 p3, 0x0

    new-array p3, p3, [I

    filled-new-array {p3}, [[I

    move-result-object p3

    const/high16 v2, -0x1000000

    filled-new-array {v2}, [I

    move-result-object v2

    invoke-direct {v6, p3, v2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    new-instance v2, Landroid/text/style/TextAppearanceSpan;

    const/4 v5, -0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct/range {v2 .. v7}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    const/16 p3, 0x21

    invoke-interface {v1, v2, v0, p2, p3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 6
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x10
        }
        names = {
            "holder",
            "i"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;

    invoke-virtual {p0, p2}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO(I)Lcom/android/mltcode/paycertificationapi/fw0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->O10IXXX0X()J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    div-float/2addr v2, v3

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->IiI10X()Ljava/lang/String;

    move-result-object v3

    const-string v4, "<unk"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "%.2fMB"

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->XIi00iiXO()Ljava/lang/String;

    move-result-object v3

    const-string v5, "0"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->IiI10X()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " - "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->XIi00iiXO()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "   "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->XO0O10(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->iO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->XO0O10(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->X11iII1O1:Ljava/lang/String;

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->XO0O10(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->highlightTerm(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->iO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->X11iII1O1:Ljava/lang/String;

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->iO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v2, v3}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->highlightTerm(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/fw0;->IIX1OXO()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->OXO1(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->OXO1(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->XIi00iiXO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/musicpicker/OXO1$OXO1;

    invoke-direct {v1, p0, v0, p2}, Lcom/sma/smartv3/ui/musicpicker/OXO1$OXO1;-><init>(Lcom/sma/smartv3/ui/musicpicker/OXO1;Lcom/android/mltcode/paycertificationapi/fw0;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0
        }
        names = {
            "viewGroup",
            "viewType"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0d0f54

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;-><init>(Lcom/sma/smartv3/ui/musicpicker/OXO1;Landroid/view/View;)V

    return-object p2
.end method

.method public setAllSelected(Z)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "isAll"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->IO:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/android/mltcode/paycertificationapi/fw0;

    invoke-virtual {v1, p1}, Lcom/android/mltcode/paycertificationapi/fw0;->X01IiOiIi(Z)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1;->iX1O1:Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/musicpicker/OXO1;->I0iXXO()I

    move-result v3

    invoke-interface {v2, v1, v3}, Lcom/sma/smartv3/ui/musicpicker/OXO1$iO;->OXO1(Lcom/android/mltcode/paycertificationapi/fw0;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
