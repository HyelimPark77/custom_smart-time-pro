.class public final Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/angcyo/dsladapter/iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/util/List;Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/q04;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/angcyo/dsladapter/DslAdapterItem;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;Z",
            "Lcom/android/mltcode/paycertificationapi/q04;",
            ")V"
        }
    .end annotation

    const-string v0, "selectorItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectorIndexList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectorParams"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p3, p4}, Lcom/angcyo/dsladapter/iO$OXO1;->OXO1(Lcom/angcyo/dsladapter/iO;Ljava/util/List;Ljava/util/List;ZLcom/android/mltcode/paycertificationapi/q04;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;

    invoke-virtual {p1, p3}, Lcom/sma/smartv3/otherdevice/charge/ChooseLanguageActivity;->setSelectorAll(Z)V

    return-void
.end method

.method public bridge XIi00iiXO(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/angcyo/dsladapter/iO$OXO1;->XIi00iiXO(Lcom/angcyo/dsladapter/iO;II)V

    return-void
.end method
