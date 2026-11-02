.class Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"

# interfaces
.implements Lcom/l4digital/fastscroll/FastScroller$OIi0;
.implements Landroid/widget/Filterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;,
        Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;
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
.field private builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

.field private contactItemList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;"
        }
    .end annotation
.end field

.field private contactItemListOriginal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;"
        }
    .end annotation
.end field

.field private currentFilterQuery:Ljava/lang/String;

.field private listener:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;Ljava/util/List;Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0,
            0x0,
            0x0
        }
        names = {
            "builder",
            "contactItemList",
            "listener"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;",
            "Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    iput-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    iput-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemListOriginal:Ljava/util/List;

    iput-object p3, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->listener:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;

    return-void
.end method

.method public static bridge synthetic I0IIOi(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;I)Lcom/sma/smartv3/ui/contactpicker/Contact;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getItem(I)Lcom/sma/smartv3/ui/contactpicker/Contact;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic IiI10X(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->currentFilterQuery:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic O00(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic OIi0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/util/List;J)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getItemPosition(Ljava/util/List;J)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->builder:Lcom/sma/smartv3/ui/contactpicker/ContactPicker$Builder;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->listener:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;

    return-object p0
.end method

.method public static bridge synthetic XOO0ii0(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getFilteredResults(Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private getFilteredResults(Ljava/lang/String;)Ljava/util/List;
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
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemListOriginal:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getDisplayName()Ljava/lang/String;

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

.method private getItem(I)Lcom/sma/smartv3/ui/contactpicker/Contact;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "pos"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    return-object p1
.end method

.method private getItemPosition(Ljava/util/List;J)I
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
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
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

    check-cast v1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getId()J

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

.method private highlightTerm(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V
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

.method public static bridge synthetic iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemListOriginal:Ljava/util/List;

    return-object p0
.end method


# virtual methods
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->currentFilterQuery:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getFilter()Landroid/widget/Filter;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->currentFilterQuery:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$2;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;)V

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
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
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSectionText(I)Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getDisplayName()Ljava/lang/String;

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

.method public getSelectedContacts()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/contactpicker/Contact;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemListOriginal:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getSelectedContactsCount()I
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContacts()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContacts()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 7
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

    instance-of v0, p1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;

    invoke-direct {p0, p2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getItem(I)Lcom/sma/smartv3/ui/contactpicker/Contact;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getDisplayName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, ""

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->O00(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;

    move-result-object v2

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->setTitleText(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->O00(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;

    move-result-object v2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getBackgroundColor()I

    move-result v5

    invoke-virtual {v2, v5}, Lcom/sma/smartv3/ui/contactpicker/RoundLetterView;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/16 v5, 0x8

    const-string v6, "\\s+"

    if-lez v2, :cond_2

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getPhoneNumbers()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/contactpicker/PhoneNumber;->getNumber()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getEmails()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->getEmails()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v6, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XO0O10(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->currentFilterQuery:Ljava/lang/String;

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->iO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/widget/TextView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, v2, v3}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->highlightTerm(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_2

    :cond_5
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->OXO1(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :goto_2
    invoke-static {p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;->XIi00iiXO(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;)Landroid/view/View;

    move-result-object p1

    new-instance v1, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;

    invoke-direct {v1, p0, v0, p2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$1;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
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

    const v0, 0x7f0d0f3e

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactViewHolder;-><init>(Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;Landroid/view/View;)V

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setSelected(Z)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->listener:Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getSelectedContactsCount()I

    move-result v3

    invoke-interface {v2, v1, v3}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter$ContactSelectListener;->onContactSelected(Lcom/sma/smartv3/ui/contactpicker/Contact;I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setContactSelected(J)V
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "id"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-direct {p0, v0, p1, p2}, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->getItemPosition(Ljava/util/List;J)I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/ui/contactpicker/Contact;

    iget-object v0, p0, Lcom/sma/smartv3/ui/contactpicker/ContactPickerAdapter;->contactItemList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/contactpicker/Contact;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->isSelected()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/contactpicker/Contact;->setSelected(Z)V

    return-void
.end method
