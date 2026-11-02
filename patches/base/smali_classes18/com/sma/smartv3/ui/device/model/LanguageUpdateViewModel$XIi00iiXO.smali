.class public final Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel;->binFileToDevice(Lcom/android/mltcode/paycertificationapi/rk;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Ljava/lang/Throwable;)V
    .locals 1

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$iO;

    invoke-virtual {p1, v0}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/model/LanguageUpdateViewModel$XIi00iiXO;->OXO1(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
