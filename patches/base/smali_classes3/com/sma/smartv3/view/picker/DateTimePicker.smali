.class public final Lcom/sma/smartv3/view/picker/DateTimePicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final I1:Lcom/sma/smartv3/view/picker/TimePicker;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/picker/DatePicker;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public X0i1O:I

.field public X11iII1O1:I

.field public X1IX:I

.field public XXX11i:I

.field public iIXi1iiXI:Lkotlin/jvm/functions/Function5;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
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

.field public iX1O1:I

.field public iXiX011:Z


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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/DateTimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/DateTimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X11iII1O1()Z

    move-result p2

    iput-boolean p2, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iXiX011:Z

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10ab

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    const p1, 0x7f0a0bb4

    .line 8
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const-string p2, "findViewById(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/picker/TimePicker;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    const p1, 0x7f0a02d6

    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/picker/DatePicker;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->IO:Lcom/sma/smartv3/view/picker/DatePicker;

    .line 10
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    const-string p3, "getInstance(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result p2

    add-int/lit8 p3, p2, 0x1

    .line 11
    invoke-virtual {p1, p3, p2}, Lcom/sma/smartv3/view/picker/DatePicker;->OIX0iXi(II)V

    .line 12
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/DateTimePicker;->iO()V

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

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/DateTimePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/view/picker/DateTimePicker;II)Lkotlin/Unit;
    .locals 6

    iput p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X1IX:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X0i1O:I

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iIXi1iiXI:Lkotlin/jvm/functions/Function5;

    if-eqz v0, :cond_0

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iX1O1:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X11iII1O1:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->XXX11i:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X1IX:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget p0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X0i1O:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/view/picker/DateTimePicker;II)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/view/picker/DateTimePicker;->O00(Lcom/sma/smartv3/view/picker/DateTimePicker;II)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/DateTimePicker;III)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/DateTimePicker;->XO0O10(Lcom/sma/smartv3/view/picker/DateTimePicker;III)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final XO0O10(Lcom/sma/smartv3/view/picker/DateTimePicker;III)Lkotlin/Unit;
    .locals 6

    iput p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iX1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X11iII1O1:I

    iput p3, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->XXX11i:I

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iIXi1iiXI:Lkotlin/jvm/functions/Function5;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X11iII1O1:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->XXX11i:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X1IX:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget p0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->X0i1O:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface/range {v0 .. v5}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final IiI10X()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iXiX011:Z

    return v0
.end method

.method public final XOO0ii0(IIIII)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->IO:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-virtual {v0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/DatePicker;->IO(III)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {p1, p4, p5}, Lcom/sma/smartv3/view/picker/TimePicker;->IO(II)V

    return-void
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function5;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iIXi1iiXI:Lkotlin/jvm/functions/Function5;

    return-object v0
.end method

.method public final iO()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->IO:Lcom/sma/smartv3/view/picker/DatePicker;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Ii01O;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/Ii01O;-><init>(Lcom/sma/smartv3/view/picker/DateTimePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/DatePicker;->setMListener(Lkotlin/jvm/functions/Function3;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    iget-boolean v1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iXiX011:Z

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->set24Hourly(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XII0011II;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XII0011II;-><init>(Lcom/sma/smartv3/view/picker/DateTimePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/picker/TimePicker;->setMListener(Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final set24Hourly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iXiX011:Z

    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/DateTimePicker;->iO()V

    return-void
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function5;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function5;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
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

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->iIXi1iiXI:Lkotlin/jvm/functions/Function5;

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->IO:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/picker/DatePicker;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DateTimePicker;->I1:Lcom/sma/smartv3/view/picker/TimePicker;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/picker/TimePicker;->setVisibleCount(I)V

    return-void
.end method
