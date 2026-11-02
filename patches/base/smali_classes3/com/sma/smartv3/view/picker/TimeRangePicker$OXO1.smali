.class public Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/TimeRangePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OXO1"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/TimeRangePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(II)V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->getMListener()Lkotlin/jvm/functions/Function4;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {p2}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->iO(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {v0}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->XO0O10(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->OXO1(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->IO:Lcom/sma/smartv3/view/picker/TimeRangePicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/TimeRangePicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/TimeRangePicker;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
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

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/view/picker/TimeRangePicker$OXO1;->OXO1(II)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
