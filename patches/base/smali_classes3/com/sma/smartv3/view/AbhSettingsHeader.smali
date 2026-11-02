.class public final Lcom/sma/smartv3/view/AbhSettingsHeader;
.super Lskin/support/widget/SkinCompatLinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbhSettingsHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhSettingsHeader.kt\ncom/sma/smartv3/view/AbhSettingsHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAbhSettingsHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhSettingsHeader.kt\ncom/sma/smartv3/view/AbhSettingsHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
    }
.end annotation


# instance fields
.field public final I1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final X11iII1O1:Landroid/widget/CheckBox;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X1IX:Z

.field public XXX11i:Z

.field public iIXi1iiXI:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final iX1O1:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/AbhSettingsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/sma/smartv3/view/AbhSettingsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lskin/support/widget/SkinCompatLinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 4
    iput-boolean p3, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X1IX:Z

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iIXi1iiXI:Ljava/lang/String;

    const/high16 v1, -0x1000000

    .line 6
    iput v1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iXiX011:I

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0d001d

    invoke-virtual {v1, v2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 8
    sget-object v1, Lcom/sma/smartv3/R$styleable;->AbhSettingsHeader:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_0

    move-object p2, v0

    :cond_0
    const/4 p3, 0x0

    .line 10
    invoke-virtual {p1, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    const v1, 0x7f0a1897

    .line 11
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string p2, "apply(...)"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->I1:Landroid/widget/TextView;

    const v1, 0x7f0a0c68

    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/widget/TextView;

    .line 13
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 p3, 0x8

    :cond_2
    invoke-virtual {v2, p3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iX1O1:Landroid/widget/TextView;

    const p2, 0x7f0a022e

    .line 16
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const-string p3, "findViewById(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X11iII1O1:Landroid/widget/CheckBox;

    .line 17
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 18
    new-instance p1, Lcom/android/mltcode/paycertificationapi/Oii1X1iO;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/Oii1X1iO;-><init>(Lcom/sma/smartv3/view/AbhSettingsHeader;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 19
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/AbhSettingsHeader;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->XIi00iiXO(Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/view/AbhSettingsHeader;Landroid/view/View;)V
    .locals 0

    iget-boolean p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X1IX:Z

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/AbhSettingsHeader;->setChecked(Z)V

    return-void
.end method


# virtual methods
.method public final getCheckEnabled()Landroid/widget/CheckBox;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X11iII1O1:Landroid/widget/CheckBox;

    return-object v0
.end method

.method public final getMDescription()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iIXi1iiXI:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDescriptionColor()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iXiX011:I

    return v0
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X0i1O:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getTvTitle()Landroid/widget/TextView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->I1:Landroid/widget/TextView;

    return-object v0
.end method

.method public final iO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X1IX:Z

    return v0
.end method

.method public final setChecked(Z)V
    .locals 3

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X1IX:Z

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->I1:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X11iII1O1:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/core/view/ViewGroupKt;->getChildren(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    instance-of v2, v1, Lcom/sma/smartv3/view/AbhSettingsItem;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/sma/smartv3/view/AbhSettingsItem;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/view/AbhSettingsItem;->setEnabled(Z)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->XXX11i:Z

    if-eqz p1, :cond_2

    return-void

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->XXX11i:Z

    iget-object p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X0i1O:Lkotlin/jvm/functions/Function1;

    if-eqz p1, :cond_3

    iget-boolean v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X1IX:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->XXX11i:Z

    return-void
.end method

.method public final setMDescription(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iIXi1iiXI:Ljava/lang/String;

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iX1O1:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setMDescriptionColor(I)V
    .locals 1

    iput p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iXiX011:I

    iget-object v0, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->iX1O1:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/AbhSettingsHeader;->X0i1O:Lkotlin/jvm/functions/Function1;

    return-void
.end method
