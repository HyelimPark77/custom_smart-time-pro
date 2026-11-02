.class public Lcom/sma/smartv3/view/picker/IntValuePicker$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/dg1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/IntValuePicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OXO1"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/picker/IntValuePicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/IntValuePicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/IntValuePicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/view/picker/IntValuePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/IntValuePicker;

    invoke-virtual {v0}, Lcom/sma/smartv3/view/picker/IntValuePicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/view/picker/IntValuePicker$OXO1;->OXO1:Lcom/sma/smartv3/view/picker/IntValuePicker;

    invoke-virtual {v1, p1}, Lcom/sma/smartv3/view/picker/IntValuePicker;->XO0O10(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
