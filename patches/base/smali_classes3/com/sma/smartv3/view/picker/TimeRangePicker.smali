.class public final Lcom/sma/smartv3/view/picker/TimeRangePicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;
    }
.end annotation


# instance fields
.field public final I1:Lcom/sma/smartv3/view/picker/TimePicker;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/picker/TimePicker;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:Lkotlin/jvm/functions/Function4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public X11iII1O1:I

.field public X1IX:I

.field public XXX11i:I

.field public iIXi1iiXI:Z

.field public iX1O1:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/TimeRangePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/TimeRangePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11iII1O1()Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iIXi1iiXI:Z

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10b1

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a0912

    .line 6
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/picker/TimePicker;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IO:Lcom/sma/smartv3/view/picker/TimePicker;

    const p1, 0x7f0a0911

    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/picker/TimePicker;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    .line 8
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->OIi0()V

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

    .line 9
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/TimeRangePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X11iII1O1:I

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X1IX:I

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->XXX11i:I

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->XXX11i:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X1IX:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X11iII1O1:I

    return p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iX1O1:I

    return-void
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iX1O1:I

    return p0
.end method


# virtual methods
.method public final IO()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iIXi1iiXI:Z

    return v0
.end method

.method public final OIX0iXi(IIII)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IO:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {v0, p1, p2}, Lcom/sma/smartv3/view/picker/TimePicker;->IO(II)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {v0, p3, p4}, Lcom/sma/smartv3/view/picker/TimePicker;->IO(II)V

    iput p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iX1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X11iII1O1:I

    iput p3, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->XXX11i:I

    iput p4, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X1IX:I

    return-void
.end method

.method public final OIi0()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IO:Lcom/sma/smartv3/view/picker/TimePicker;

    iget-boolean v1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iIXi1iiXI:Z

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->set24Hourly(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IO:Lcom/sma/smartv3/view/picker/TimePicker;

    new-instance v1, Lcom/sma/smartv3/view/picker/TimeRangePicker$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/TimeRangePicker$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/picker/TimeRangePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->setMListener(Lkotlin/jvm/functions/Function2;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    iget-boolean v1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iIXi1iiXI:Z

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->set24Hourly(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    new-instance v1, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;-><init>(Lcom/sma/smartv3/view/picker/TimeRangePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->setMListener(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function4;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function4<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X0i1O:Lkotlin/jvm/functions/Function4;

    return-object v0
.end method

.method public final set24Hourly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iIXi1iiXI:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->OIi0()V

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function4;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function4;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function4<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->X0i1O:Lkotlin/jvm/functions/Function4;

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IO:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/picker/TimePicker;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/picker/TimePicker;->setVisibleCount(I)V

    return-void
.end method
