.class public Lcom/sma/smartv3/view/picker/DatePicker$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/dg1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/DatePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OXO1"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/picker/DatePicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/DatePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/DatePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/DatePicker;->getMListener()Lkotlin/jvm/functions/Function3;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/DatePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-static {v0}, Lcom/sma/smartv3/view/picker/DatePicker;->XO0O10(Lcom/sma/smartv3/view/picker/DatePicker;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/DatePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-static {v1}, Lcom/sma/smartv3/view/picker/DatePicker;->iO(Lcom/sma/smartv3/view/picker/DatePicker;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/DatePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/DatePicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/DatePicker;->OXO1(Lcom/sma/smartv3/view/picker/DatePicker;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v0, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
