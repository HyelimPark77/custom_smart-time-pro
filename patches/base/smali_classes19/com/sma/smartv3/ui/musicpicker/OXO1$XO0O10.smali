.class public Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/ui/musicpicker/OXO1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "XO0O10"
.end annotation


# instance fields
.field public I1:Landroid/widget/TextView;

.field public final IO:Landroid/view/View;

.field public X11iII1O1:Landroidx/appcompat/widget/AppCompatCheckBox;

.field public final synthetic XXX11i:Lcom/sma/smartv3/ui/musicpicker/OXO1;

.field public iX1O1:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/musicpicker/OXO1;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            "this$0",
            "view"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->XXX11i:Lcom/sma/smartv3/ui/musicpicker/OXO1;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->IO:Landroid/view/View;

    const p1, 0x7f0a0c17

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->I1:Landroid/widget/TextView;

    const p1, 0x7f0a0c09

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->iX1O1:Landroid/widget/TextView;

    const p1, 0x7f0a0209

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/AppCompatCheckBox;

    iput-object p1, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->X11iII1O1:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-void
.end method

.method public static bridge synthetic OXO1(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroidx/appcompat/widget/AppCompatCheckBox;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->X11iII1O1:Landroidx/appcompat/widget/AppCompatCheckBox;

    return-object p0
.end method

.method public static bridge synthetic XIi00iiXO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->IO:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic XO0O10(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->I1:Landroid/widget/TextView;

    return-object p0
.end method

.method public static bridge synthetic iO(Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/musicpicker/OXO1$XO0O10;->iX1O1:Landroid/widget/TextView;

    return-object p0
.end method
