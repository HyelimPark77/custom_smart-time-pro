.class public final Lcom/sma/smartv3/view/picker/DatePicker;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/view/picker/DatePicker$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\ncom/sma/smartv3/view/picker/DatePicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\ncom/sma/smartv3/view/picker/DatePicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"
    }
.end annotation


# instance fields
.field public final I1:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final IO:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public O001I:Ljava/util/Calendar;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X0i1O:I

.field public X11iII1O1:I

.field public X1IX:I

.field public XXX11i:I

.field public iIXi1iiXI:I

.field public final iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iXiX011:Lkotlin/jvm/functions/Function3;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/DatePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/view/picker/DatePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
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
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p2

    const-string p3, "getInstance(...)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result p2

    iput p2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X11iII1O1:I

    const/16 p2, 0x780

    .line 7
    iput p2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    .line 8
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0d10b0

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p0, p3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    sget-boolean p1, Lcom/android/mltcode/paycertificationapi/gk4;->I0IIOi:Z

    const p2, 0x7f0a1953

    const p3, 0x7f0a1952

    const v0, 0x7f0a1954

    const-string v1, "findViewById(...)"

    if-nez p1, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->IiXIIX1O1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XiOIO()Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object p1

    sget-object v2, Lcom/sma/smartv3/util/DateTimeFormat;->ddMMyyyy:Lcom/sma/smartv3/util/DateTimeFormat;

    if-ne p1, v2, :cond_0

    .line 10
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 11
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 12
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    goto :goto_0

    .line 13
    :cond_0
    sget-boolean p1, Lcom/android/mltcode/paycertificationapi/gk4;->I0IIOi:Z

    if-nez p1, :cond_1

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->IiXIIX1O1()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XiOIO()Lcom/sma/smartv3/util/DateTimeFormat;

    move-result-object p1

    sget-object v2, Lcom/sma/smartv3/util/DateTimeFormat;->yyyyMMdd:Lcom/sma/smartv3/util/DateTimeFormat;

    if-ne p1, v2, :cond_1

    .line 14
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 15
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 18
    invoke-virtual {p0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 19
    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/view/WheelView/WheelView;

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/DatePicker;->OIi0()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/sma/smartv3/view/picker/DatePicker;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic I0IIOi(Lcom/sma/smartv3/view/picker/DatePicker;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/DatePicker;->I0iXXO()V

    return-void
.end method

.method public static final synthetic IiI10X(Lcom/sma/smartv3/view/picker/DatePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    return-void
.end method

.method public static final synthetic O00(Lcom/sma/smartv3/view/picker/DatePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    return-void
.end method

.method public static final synthetic OXO1(Lcom/sma/smartv3/view/picker/DatePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    return p0
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/view/picker/DatePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    return p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/view/picker/DatePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    return p0
.end method

.method public static final synthetic XOO0ii0(Lcom/sma/smartv3/view/picker/DatePicker;I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    return-void
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/view/picker/DatePicker;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    return p0
.end method


# virtual methods
.method public final I0iXXO()V
    .locals 8

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget v1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->X01IiOiIi(Ljava/util/Calendar;I)V

    iget v1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OII(Ljava/util/Calendar;I)V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    const-string v2, "also(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XO0O10(Ljava/util/Calendar;)I

    move-result v0

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    if-le v2, v0, :cond_0

    iput v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v3, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    sub-int/2addr v3, v1

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_1

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2, v3}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v5, v4

    :goto_1
    if-ge v5, v3, :cond_2

    add-int/lit8 v5, v5, 0x1

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->O001I:Ljava/util/Calendar;

    if-eqz v0, :cond_6

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result v2

    iget v3, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    if-eq v2, v3, :cond_3

    goto :goto_4

    :cond_3
    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v3

    add-int/2addr v3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    iget-object v3, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    sub-int/2addr v2, v1

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v3

    add-int/2addr v3, v1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    move v6, v4

    :goto_2
    if-ge v6, v3, :cond_4

    add-int/lit8 v6, v6, 0x1

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v5}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IO(Ljava/util/Calendar;)I

    move-result v3

    add-int/2addr v3, v1

    if-ne v2, v3, :cond_6

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    iget-object v3, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    sub-int/2addr v2, v1

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v4, v0, :cond_5

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    :cond_6
    :goto_4
    return-void
.end method

.method public final IO(III)V
    .locals 1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->X01IiOiIi(Ljava/util/Calendar;I)V

    invoke-static {v0, p2}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OII(Ljava/util/Calendar;I)V

    invoke-static {v0, p3}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->IIX1OXO(Ljava/util/Calendar;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->O10IXXX0X(Ljava/util/Calendar;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->OIX0iXi(Ljava/util/Calendar;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OIi1iX;->XIi00iiXO(Ljava/util/Calendar;)I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iIXi1iiXI:I

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget p2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X1IX:I

    iget p3, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    sub-int/2addr p2, p3

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget p2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X0i1O:I

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setInitPosition(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/view/picker/DatePicker;->I0iXXO()V

    return-void
.end method

.method public final OIX0iXi(II)V
    .locals 3

    iput p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X11iII1O1:I

    iput p2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    sub-int/2addr p1, p2

    add-int/lit8 p1, p1, 0x1

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_0

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    add-int/2addr v2, v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    return-void
.end method

.method public final OIi0()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/WheelView/WheelView;->OIi0()V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    iget v1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->X11iII1O1:I

    iget v2, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    iget v5, p0, Lcom/sma/smartv3/view/picker/DatePicker;->XXX11i:I

    add-int/2addr v5, v4

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/DatePicker$XIi00iiXO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/DatePicker$XIi00iiXO;-><init>(Lcom/sma/smartv3/view/picker/DatePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_1
    if-ge v3, v2, :cond_1

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setItems(Ljava/util/List;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/DatePicker$iO;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/DatePicker$iO;-><init>(Lcom/sma/smartv3/view/picker/DatePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    new-instance v1, Lcom/sma/smartv3/view/picker/DatePicker$XO0O10;

    invoke-direct {v1, p0}, Lcom/sma/smartv3/view/picker/DatePicker$XO0O10;-><init>(Lcom/sma/smartv3/view/picker/DatePicker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setListener(Lcom/android/mltcode/paycertificationapi/dg1;)V

    return-void
.end method

.method public final getMListener()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iXiX011:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method

.method public final setMListener(Lkotlin/jvm/functions/Function3;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function3;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
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

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iXiX011:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public final setMaxDate(J)V
    .locals 0

    return-void
.end method

.method public final setVisibleCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->I1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->iX1O1:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker;->IO:Lcom/sma/smartv3/view/WheelView/WheelView;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/WheelView/WheelView;->setVisibleCount(I)V

    return-void
.end method
