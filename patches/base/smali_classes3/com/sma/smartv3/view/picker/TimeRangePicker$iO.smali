.class public final Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;
.super Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/view/picker/TimeRangePicker;->OIi0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic I1:Lcom/sma/smartv3/view/picker/TimeRangePicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/TimeRangePicker;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;->I1:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-direct {p0, p1}, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;-><init>(Lcom/sma/smartv3/view/picker/TimeRangePicker;)V

    return-void
.end method


# virtual methods
.method public OXO1(II)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;->I1:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {v0, p1}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->O00(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;->I1:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {v0, p2}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->IiI10X(Lcom/sma/smartv3/view/picker/TimeRangePicker;I)V

    invoke-super {p0, p1, p2}, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->OXO1(II)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/picker/TimeRangePicker$iO;->OXO1(II)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
