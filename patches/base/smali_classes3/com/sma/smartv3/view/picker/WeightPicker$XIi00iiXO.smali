.class public Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/dg1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/view/picker/WeightPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "XIi00iiXO"
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/view/picker/WeightPicker;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 3
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {p1}, Lcom/sma/smartv3/view/picker/WeightPicker;->OXO1(Lcom/sma/smartv3/view/picker/WeightPicker;)I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/WeightPicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object v2

    aget v0, v2, v0

    add-int/lit8 v0, v0, 0x14

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object v2

    aget v1, v2, v1

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->OXO1(Lcom/sma/smartv3/view/picker/WeightPicker;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/l76;->XOO0ii0(III)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {p1}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object p1

    aget p1, p1, v1

    const/16 v2, 0xa

    if-ne p1, v2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {p1}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object p1

    aput v0, p1, v1

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-virtual {p1}, Lcom/sma/smartv3/view/picker/WeightPicker;->getMListener()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object v2

    aget v0, v2, v0

    add-int/lit8 v0, v0, 0x2c

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->XIi00iiXO(Lcom/sma/smartv3/view/picker/WeightPicker;)[I

    move-result-object v2

    aget v1, v2, v1

    iget-object v2, p0, Lcom/sma/smartv3/view/picker/WeightPicker$XIi00iiXO;->OXO1:Lcom/sma/smartv3/view/picker/WeightPicker;

    invoke-static {v2}, Lcom/sma/smartv3/view/picker/WeightPicker;->OXO1(Lcom/sma/smartv3/view/picker/WeightPicker;)I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/l76;->XOO0ii0(III)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
